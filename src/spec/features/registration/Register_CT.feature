Feature: Je remplis le formulaire 1
  En tant que Utilisateur je souhaite me conneecter au site Mercury

  @module_register
  Scenario Outline: Je remplis le formulaire1
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
    And Je saisie username "<username>"
    And Je saisie une premiere fois password "<password>"
    And Je confirm password "<confirm password>"
    And Je clique sur le boutton soumettre
    Then Je me redirige vers la page register_succes "<message>"

    Examples: 
      | username | lastname | phone | email                | adresse | city    | provance | postal code | country | name    | password | confirm password | message                     |
      | Karim    | Ghommam  | 22222 | ghkarim@gmail.com    | Mahdia  | Mahdia  | Mahdia   |    5141     |TUNISIA| Karim   | root     | root             | Note: Your user name is Karim.|
      | Hamdi    | G        | 55555 | ghkarim692@gmail.com | Mahdia  | Mahdia  | Mahdia   |    5141     |TUNISIA| Hamdi   | root     | root             | Note: Your user name is Hamdi.|
