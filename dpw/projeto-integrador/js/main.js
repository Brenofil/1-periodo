var usuarioLogado = window.localStorage.getItem('usuarioLogado');

console.info('usuarioLogado :: ', usuarioLogado);

if( !usuarioLogado ) {
  console.info('usuarioLogado == false');
  atualizarBotoesHome('hidden');
  document.getElementById("formLogin").style.visibility = 'visible';
  document.getElementById("usuarioInfo").remove();
  // limpa o carrosel de filmes
  document.getElementById("carousel-1").remove();

} else {
  document.getElementById("formLogin").remove();  
  document.getElementById("nomeUsuario").innerHTML = "Olá <a href=\"profile.html\" class=\"texto-azul\"><strong>" + window.localStorage.getItem('nomeUsuario') + "</strong></a>!&nbsp; seja bem-vindo.&nbsp;&nbsp;";
  atualizarBotoesHome('visible');
}

function login () {
  var usuario = document.getElementById("usuario");
  var senha = document.getElementById("senha");
  
  if(usuario.value === '' || senha.value === ''){
    alert('Usuário e senha são campos obrigatórios.');
    return;
  }

  console.info('login :: usuario', usuario);
  console.info('login :: senha', senha);

  window.localStorage.setItem('usuarioLogado', true);
  window.localStorage.setItem('nomeUsuario', usuario.value);
}

function logout () {  
  window.localStorage.removeItem('usuarioLogado');
  window.localStorage.removeItem('nomeUsuario');
}

function atualizarBotoesHome(status) {
  if(document.getElementById('btnMeusFilmes') != null){
    document.getElementById('btnMeusFilmes').style.visibility = status;
  }
  if(document.getElementById('btnMinhasSeries') != null){
    document.getElementById('btnMinhasSeries').style.visibility = status;
  }
  if(document.getElementById('btnMinhasHQs')){
    document.getElementById('btnMinhasHQs').style.visibility = status;
  }
  if(document.getElementById('btnMeusLivros')){
    document.getElementById('btnMeusLivros').style.visibility = status;
  }
}