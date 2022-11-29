#language:es
  Característica: Un usuario quiere registrarse, loguearse y crear un articulo
    Escenario: El usuario ingresa a la pagina
      Dado el usuario ingresa al navegador y abre la pagina demo
      Entonces el usuario da clic en el boton Sign up de la esquina superior derecha
      Y diligencia los campos de registro
      Y da clic en el boton Sign up
      Entonces el usuario se loguea
      Y diligencia los campos de login
      Entonces da clic en New article
      Y diligencia los campos del articulo
      Y da clic en Publish Article
      Entonces se valida la creacion del articulo