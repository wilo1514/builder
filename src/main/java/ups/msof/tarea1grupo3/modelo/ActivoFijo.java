package ups.msof.tarea1grupo3.modelo;

public class ActivoFijo {
    private String codigo;
    private String nombres;
    private double precio;

    private String marca;
    private String proveedor;
    private int numeroExistentes;
    private int vidaUtilAnios;
    private String ubicacion;

    public ActivoFijo(String codigo, String nombres, double precio) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getNumeroExistentes() {
        return numeroExistentes;
    }

    public void setNumeroExistentes(int numeroExistentes) {
        this.numeroExistentes = numeroExistentes;
    }

    public int getVidaUtilAnios() {
        return vidaUtilAnios;
    }

    public void setVidaUtilAnios(int vidaUtilAnios) {
        this.vidaUtilAnios = vidaUtilAnios;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "ActivoFijo{" +
                "codigo='" + codigo + '\'' +
                ", nombres='" + nombres + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", numeroExistentes=" + numeroExistentes +
                ", vidaUtilAnios=" + vidaUtilAnios +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }
}