<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form method="post" action="signin">
	<input type="hidden" name="action" value="signin" />
	
	<div class="input-field">
		<i class="material-icons prefix">account_circle</i>
		<input id="username" type="text" class="validate" name="username" />
		<label for="username">Votre nom d'utilisateur</label>
	</div>
	
	<div class="input-field">
		<i class="material-icons prefix">account_circle</i>
		<input id="nom" type="text" class="validate" name="nom" />
		<label for="nom">Votre nom</label>
	</div>
	
	<div class="input-field">
		<i class="material-icons prefix">account_circle</i>
		<input id="prenom" type="text" class="validate" name="prenom" />
		<label for="prenom">Votre prénom</label>
	</div>
	
	<div class="input-field">
		<i class="material-icons prefix">vpn_key</i>
		<input id="password" type="password" class="validate" name="password" />
		<label for="password">Votre mot de passe</label>
	</div>
	
	<button class="btn waves-effect waves-light" type="submit">
		OK <i class="material-icons right">send</i>
	</button>
</form>