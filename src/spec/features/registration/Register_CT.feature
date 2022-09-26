Feature: Verifier le module register
  En Tant que Utilisateur je souhaite remplir le formulaire Afin de m enregistrer

  @module_register
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When Je saisie le username "<username>"
    And Je saisie password "<lastname>"
    And Je clique sur le boutton submit
    Then Je me redirige vers la page home "Login Successfully"

    Examples: 
      | username | lastname |
      | karim    | Ghommam  |
      | karim    | gh       |
