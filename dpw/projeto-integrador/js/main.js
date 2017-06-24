var usuarioLogado = window.localStorage.getItem('usuarioLogado');

console.log('usuarioLogado :: ', usuarioLogado);

if( !usuarioLogado ) {
  console.log('usuarioLogado == null');
  atualizarBotoesHome('hidden');
  document.getElementById("formLogin").style.visibility = 'visible';
  document.getElementById("usuarioInfo").style.visibility = 'hidden';
} else {
  document.getElementById("formLogin").remove();  
  document.getElementById("nomeUsuario").innerHTML = "Seja Bem Vindo, " + window.localStorage.getItem('nomeUsuario');
  atualizarBotoesHome('visible');
}

function login () {
  var usuario = document.getElementById("usuario");
  var senha = document.getElementById("senha");
  
  if(usuario.value === '' || senha.value === ''){
    alert('Usuário e senha são campos obrigatórios.');
    return;
  }

  console.log('login :: usuario', usuario);
  console.log('login :: senha', senha);

  window.localStorage.setItem('usuarioLogado', true);
  window.localStorage.setItem('nomeUsuario', usuario.value);
}

function logout () {  
  window.localStorage.removeItem('usuarioLogado');
  window.localStorage.removeItem('nomeUsuario');
}

function atualizarBotoesHome(status) {
  document.getElementById('btnMeusFilmes').style.visibility = status;
  document.getElementById('btnMinhasSeries').style.visibility = status;
  document.getElementById('btnMinhasHQs').style.visibility = status;
  document.getElementById('btnMeusLivros').style.visibility = status;
}