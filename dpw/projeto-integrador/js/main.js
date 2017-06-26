var usuarioLogado = window.localStorage.getItem('usuarioLogado');

console.info('usuarioLogado :: ', usuarioLogado);

if( !usuarioLogado ) {
  console.info('usuarioLogado == false');
  atualizarBotoesHome('hidden');

  if(document.getElementById("formLogin") !== null){
    document.getElementById("formLogin").style.visibility = 'visible';
  }
  // trata especialmente a pagina de profile
  if(document.getElementById("formLogin") !== null && document.getElementById("nomePerfil") !== null){
    document.getElementById("formLogin").style.visibility = 'hidden';
  }
  if(document.getElementById("usuarioInfo") !== null){
    document.getElementById("usuarioInfo").remove();
  }
  // limpa o carrosel de filmes
  var carrossel = document.getElementById("carousel-1");
  if(carrossel !== null){
    carrossel.remove();
  }
  // limpa a div do profile 
  var paginaProfile = document.getElementById("paginaProfile");
  if(paginaProfile !== null){
    paginaProfile.remove();
  }
} else {
  document.getElementById("formLogin").remove();
  document.getElementById("nomeUsuario").innerHTML = "Olá <a href=\"profile.html\" class=\"texto-azul\"><strong>" + window.localStorage.getItem('nomeUsuario') + "</strong></a>!&nbsp; seja bem-vindo.&nbsp;&nbsp;";
  
  var nomeUsuario = window.localStorage.getItem('nomeUsuario');

  var usuarioLocalStorage = JSON.parse(window.localStorage.getItem(nomeUsuario));

  if(document.getElementById("nomePerfilH2") !== null){
    document.getElementById("nomePerfilH2").innerHTML = usuarioLocalStorage.nome;
  }
  
  if(document.getElementById("nomePerfil") !== null){
    document.getElementById("nomePerfil").innerHTML = "Nome: " + usuarioLocalStorage.nome;
  }

  if(document.getElementById("loginPerfil") !== null){
    document.getElementById("loginPerfil").innerHTML = "Login: " + usuarioLocalStorage.login;
  }

  atualizarBotoesHome('visible');
}

function login () {
  var usuario = document.getElementById("usuario");
  var senha = document.getElementById("senha");

  if(usuario.value === '' || senha.value === ''){
    alert('Usuário e senha são campos obrigatórios.');
    return;
  }

  var usuarioLocalStorage = JSON.parse(window.localStorage.getItem(usuario.value));

  if (usuarioLocalStorage != null && usuarioLocalStorage.login != null) {

    if(usuarioLocalStorage.senha != senha.value){
      alert('Senha não confere.');
      return;
    }
    
    window.localStorage.setItem('usuarioLogado', true);
    window.localStorage.setItem('nomeUsuario', usuarioLocalStorage.login);

  } else {
    alert('Usuário não cadastrado.');
    return;
  }

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
  if(document.getElementById('botaoIncluirTopico')){
    document.getElementById('botaoIncluirTopico').style.visibility = status;
  }
}

function cadastrarUsuario() {
  var nomeUsuario = document.getElementById("nomeUsuario");
  var loginUsuario = document.getElementById("loginUsuario");
  var senhaUsuario = document.getElementById("senhaUsuario");
  var senhaUsuario2 = document.getElementById("senhaUsuario2");

  if(nomeUsuario.value === '' || loginUsuario.value === '' || senhaUsuario.value === '' || senhaUsuario2.value === '') {
    alert('Todos os campos do cadastro de usuário são obrigatórios.');
    return false;
  }

  if(loginUsuario.value.length < 5) {
    alert('O login do usuário deve possuir ao menos 5 caracteres.');
    return false;
  }

  if(senhaUsuario.value !== senhaUsuario2.value) {
    alert('Senhas não conferem.');
    return false;
  }

  var usuario = {
    nome: nomeUsuario.value,
    login: loginUsuario.value,
    senha: senhaUsuario.value
  };

  var usuarioLocalStorage = JSON.parse(window.localStorage.getItem(loginUsuario.value));

  if (usuarioLocalStorage != null && usuarioLocalStorage.login != null) {
    alert('Usuário já cadastrado.');
    return false;

  } else {
    window.localStorage.setItem(usuario.login, JSON.stringify(usuario));
  }

  $link = $('a:first');
  $link[0].click();

  alert('Usuário cadastrado com sucesso');
  return;
}

function cadastrarTopico () {

  var nomeTopico = document.getElementById("nomeTopico");
  var descricaoTopico = document.getElementById("descricaoTopico");

  if (nomeTopico.value == '' || descricaoTopico.value == '') {
    alert('Todos os campos são obrigatórios');
    return false;
  }

  var tabelaForumFilmes = document.getElementById("tabelaForumFilmes");

  var linhaTabela = tabelaForumFilmes.insertRow(6);

  var colunaTopico = linhaTabela.insertCell(0);
  var colunaData = linhaTabela.insertCell(1);
  var colunaPosts = linhaTabela.insertCell(2);

  colunaData.classList.add('centralizado');
  colunaPosts.classList.add('centralizado');

  // Add some text to the new cells:
  colunaTopico.innerHTML = nomeTopico.value;
  colunaData.innerHTML = '27/06/2017';
  colunaPosts.innerHTML = '<a href="posts-forum-filmes.html">Visualizar <span class="badge">0</span></a>';

  $('#modalTopico').modal('hide');

  nomeTopico.value = '';
  descricaoTopico.value = '';

  return;
}