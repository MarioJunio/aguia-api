package br.com.aguia.resource.report;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.aguia.service.LancamentoService;
import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

	@Autowired
	private LancamentoService lancamentoService;

	@GetMapping(path = "/relatorio/por-pessoa", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<byte[]> relatorioLancamentoPorTipo(
			@RequestParam("data-inicio") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dataInicio,
			@RequestParam("data-fim") @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate dataFim) {

		try {
			byte[] relatorioPorPessoa = lancamentoService.relatorioPorPessoa(dataInicio, dataFim);
			return ResponseEntity.ok(relatorioPorPessoa);
		} catch (JRException e) {
			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

}
