@Orange
Feature: Authentification sur le site Orange
  En Tant qu utilisateur je veux m authentifier sur le site Orange afin de me connecter sur mon compte 4

  Background: 
     Given Je me connecte au site Orange  
     When Je saisie mon userName "Admin"   
     And Je saisie mon password "admin123" 
     And Je clique sur le boutton login


  @login
  Scenario: connection au site Orange
    Then Je me redirige vers mon compte


  @logout
  Scenario: deconnexion du site Orange
    And Je clique sur icone du proprietaire du compte
    And Je clique sur le boutton logout    
    Then Je me redirige vers la page home

