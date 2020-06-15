import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroPonto {
	private String idRegPonto;
	private LocalDate dataRegistro;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaSaida;


	public String getIdRegPonto() {
		return idRegPonto;
	}

	public void setIdRegPonto(String idRegPonto) {
		this.idRegPonto = idRegPonto;
	}

	public LocalDate getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalDateTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalDateTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public void apresentarRegistroPonto() {
		DateTimeFormatter horaEdata = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		System.out.println("Data do registro: " + dataRegistro.format(data));
		System.out.println("Hora de entrada no trabalho: " + horaEntrada.format(horaEdata));
		System.out.println("Hora de saída do trabalho: " + horaSaida.format(horaEdata));
		System.out.println("======================= **** =====================");
	}

}
