function vaciarNombres(){
    let textos = document.querySelectorAll("input[type='text'], input[type='password'], textarea");
    textos.forEach(function(texto) {
        texto.value = "";
    });
}