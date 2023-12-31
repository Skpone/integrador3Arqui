package application.DTOs;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ReporteDTO {
    private List<CarreraConInscriptosYEgresadosDTO> carreras;

    public ReporteDTO() {
        this.carreras = new ArrayList<>();
    }

    public void agregarCarrerasConInscriptosEnAnio(CarreraConInscriptosYEgresadosDTO carrera){
        this.carreras.add(carrera);
    }

    /*
    @Override
    public String toString() {
        return "ReporteDTO{" + "carreras=" + carreras + '}';
    }*/
}
