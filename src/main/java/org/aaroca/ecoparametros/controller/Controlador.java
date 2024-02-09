package org.aaroca.ecoparametros.controller;

import jakarta.validation.Valid;
import org.aaroca.ecoparametros.model.Colecciones;
import org.aaroca.ecoparametros.model.Formulario;
import org.aaroca.ecoparametros.model.Pais;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

@Controller
@RequestMapping("formulario")
public class Controlador extends Colecciones{
 @ModelAttribute("musicas")
 private Map<String,String> devuelveListaMusicas(){
 return Colecciones.getListaMusicas();
 }
 @ModelAttribute("aficiones")
 private Map<String,String> devuelveAficiones(){return Colecciones.getListaAficiones();}
@ModelAttribute("generoSel")
private Map<String,String> devuelveGeneros(){return Colecciones.getListaGeneros();}
@ModelAttribute("listaPaises")
private Map<String, Pais> devuelvePrefijoTel(){return Colecciones.getListaPaises();}


 @GetMapping("idiomas")
  public String idioma(){
  return "fragmentosIdioma";
  }


 @GetMapping("devuelve")
    public String formulario(Model modelo){
     Formulario formulario = new Formulario();
     formulario.setNombre("Lola");
     formulario.setPaisSel("pt");
     formulario.setPrefijoTel("33");
     formulario.setMusicas(Arrays.asList("F","R"));
     formulario.setAficiones(Arrays.asList("D","P","V"));
     modelo.addAttribute("formulario", formulario);
     System.out.println("Cargando formulario");
     return "formulario";
 }
 @PostMapping("recibeParametros")
    public String recibeParametrosObjeto( Model modelo ,
         @Valid @ModelAttribute("formulario") Formulario form,
         BindingResult result){
     Formulario.incrementarIteraciones();
     boolean errores=false;

     if(result.hasErrors()){
      errores=true;

     }
  modelo.addAttribute("errores", errores);

     System.out.println("Repintando formulario");

     return "formulario";
 }
}




  /* @GetMapping("form")
    public String formulario(Model modelo ){
        System.out.println("Cargando formulario");
      //  modelo.addAttribute("datosForm",datosFormulario);
       modelo.addAttribute("Paises",getListaPaises());
      //  Map <String, String> paises= Colecciones.devuelvePaises(paises);
        return "form";
    }


@PostMapping("recibeParametros")
    public String formularioRepintado(Model modelo, @ModelAttribute("DatosForm") DatosForm datosForm){

return "recibeParametros";
  }





































@GetMapping("/cuki")
@ResponseBody
public String pruebaCuki(Model modelo, HttpServletResponse respuestaHttp, @CookieValue(name="contador",defaultValue = "0")
                         String contenido ) {


    int num=1;
    if (!contenido.equals("0")) { //Se ha recibido correctamente la cuki
       num= Integer.parseInt(contenido);
       num++;
        contenido= String.valueOf(num);
        System.out.println(contenido);
    }
  //  Cookie miCookie = new Cookie("contador",""+num );
    Cookie miCookie = new Cookie("contador",contenido );
    respuestaHttp.addCookie(miCookie);

    return "Contenido de la cookie: "+contenido;
 }
    @GetMapping("user")
    public String usuario() {
        return "Usuario.html";
    }
    @PostMapping("password")
    public String password(){
      return "contraseña.html";
    }
}
*/

