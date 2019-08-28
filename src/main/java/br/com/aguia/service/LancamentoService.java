package br.com.aguia.service;

import java.io.InputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.aguia.dto.report.LancamentoTipoPessoaDTO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class LancamentoService {

	public byte[] relatorioPorPessoa(LocalDate inicio, LocalDate fim) throws JRException {
		final String RECEITA = "Receita";
		final String DESPESA = "Despesa";

		List<LancamentoTipoPessoaDTO> lancamentos = new ArrayList<>();

		LancamentoTipoPessoaDTO l1 = new LancamentoTipoPessoaDTO(RECEITA, "Mario Marques", BigDecimal.valueOf(100));
		LancamentoTipoPessoaDTO l2 = new LancamentoTipoPessoaDTO(DESPESA, "Mario Marques", BigDecimal.valueOf(240));

		LancamentoTipoPessoaDTO l3 = new LancamentoTipoPessoaDTO(RECEITA, "Thiago Prado", BigDecimal.valueOf(852));
		LancamentoTipoPessoaDTO l4 = new LancamentoTipoPessoaDTO(DESPESA, "Thiago Prado", BigDecimal.valueOf(234));

		lancamentos.add(l1);
		lancamentos.add(l2);
		lancamentos.add(l3);
		lancamentos.add(l4);

		Map<String, Object> parametros = new HashMap<>();
		parametros.put("dt_inicio",
				Date.from(inicio.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		parametros.put("dt_fim", Date.from(fim.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		InputStream is = this.getClass().getResourceAsStream("/relatorios/lancamentos-tipo-pessoa.jasper");

		JasperPrint jasperPrint = JasperFillManager.fillReport(is, parametros,
				new JRBeanCollectionDataSource(lancamentos));

		return JasperExportManager.exportReportToPdf(jasperPrint);
	}
}
