package org.aaroca.ecoparametros.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.aaroca.ecoparametros.model.validaciones.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.multipart.MultipartFile;


import java.time.LocalDate;
import java.util.List;



@Data//Generando los getters y setters con lombok me da error así que aun asi los he generado
@ToString
@ComprobarClaves
@ComprobarEdadFechaNac
public class Formulario {
    @NumberFormat(style = NumberFormat.Style.NUMBER) // Asegura que sea numérico
    public static int iteraciones = 1;
    @NotBlank
    private String nombre;
    @Size(min=6, max=12)
   // @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!#$%&])[A-Za-z\\d!#$%&]*")
    @Pattern(regexp ="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&]).*")
    @NotBlank
    private String clave;
    @NotBlank
    private String confirmarClave;
    @NotNull
    @ComprobarGenero
    private String generoSeleccionado;
    @NotNull
    @DateTimeFormat(pattern ="dd/MM/yyyy")
    @ComprobarFechaNac
    private LocalDate fechaNacimiento;
    @NotNull
    private Integer edad=0;
    @NotNull
    @ComprobarPrefijoTel
    private String prefijoTel;
    @NotBlank
    @Size(min = 9, max = 9)
    private String tel;
    @NotNull
    @ComprobarEmail
    private String email;
    @NotNull
    private String url;
    @NotBlank
    @ComprobarPais
    private String paisSel;
    @NotNull
    private String archivosSel;
    @NotNull
    private List<String> musicas;
    @NotNull
    private String comentarios;
    @NotNull
    private List<String> aficiones;
    @NotNull
    @ComprobarLicencia
    private boolean aceptaLicencia;
    private List<String> parametrosRecibidos;

    public Formulario() {

    }


    public Formulario(String nombre, String password, String confirmPassword, String genero, LocalDate fechaNacimiento, int edad, String prefijoTel, String tel, String email, String url, String paisSel, String comentarios, String generos, String archivo, List<String> aficiones, List<String> musicas) {

        this.nombre = nombre;
        this.clave = password;
        this.confirmarClave = confirmPassword;
        this.generoSeleccionado = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.prefijoTel = prefijoTel;
        this.tel = tel;
        this.email = email;
        this.url = url;
        this.paisSel = paisSel;
        this.archivosSel = archivo;
        this.comentarios = comentarios;
        this.aficiones = aficiones;
        this.musicas = musicas;

    }

    public static int getIteraciones() {
        return iteraciones;
    }

    public static void incrementarIteraciones() {
        iteraciones++;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getConfirmarClave() {
        return confirmarClave;
    }

    public void setConfirmarClave(String confirmarClave) {
        this.confirmarClave = confirmarClave;
    }

    public String getGeneroSeleccionado() {
        return generoSeleccionado;
    }

    public void setGeneroSeleccionado(String generoSeleccionado) {
        this.generoSeleccionado = generoSeleccionado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPrefijoTel() {
        return prefijoTel;
    }

    public void setPrefijoTel(String prefijoTel) {
        this.prefijoTel = prefijoTel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPaisSel() {
        return paisSel;
    }

    public void setPaisSel(String paisSel) {
        this.paisSel = paisSel;
    }

    public String getArchivosSel() {
        return archivosSel;
    }

    public void setArchivosSel(String archivosSel) {
        this.archivosSel = archivosSel;
    }

    public List<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<String> musicas) {
        this.musicas = musicas;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }


    public List<String> getAficiones() {
        return aficiones;
    }

    public void setAficiones(List<String> aficiones) {
        this.aficiones = aficiones;
    }

    public boolean isAceptaLicencia() {
        return aceptaLicencia;
    }

    public void setAceptaLicencia(boolean aceptaLicencia) {
        this.aceptaLicencia = aceptaLicencia;
    }
}
