Feature: Je creer un nouveau 
  En tant que Utilisateur je souhaite me conneecter au site Mercury

  @register
  Scenario: Je creer un nouveau compte
    Given Je me connecte sur lapplication Mercury
    When Je click sur le lien register
    And Je saisie le firstname "<username>"
    And Je saisie lastname "<lastname>"
    And Je saisie phone "<phone>"
    And Je saisie email "<email>"
    And Je saisie adresse "<adresse>"
    And Je saisie city "<city>"
    And Je saisie provance "<provance>"
    And Je saisie postal code "<postal code>"
    And Je selectionne country "<country>"
    And Je saisie username "<name>"
    And Je saisie une premiere fois password "<password>"
    And Je confirm password "<confirm password>"
    And Je clique sur le boutton soumettre
    Then Je me redirige vers la page register_succes " Note: Your user name is Karim."

    Examples: 
      | username | lastname | phone | email | adresse| city | provance | postal code | country | name | password | confirm password 
      | karim    | Ghommam  |
      | karim    | gh       |
