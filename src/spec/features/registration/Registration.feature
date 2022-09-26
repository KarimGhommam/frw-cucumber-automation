Feature: Je creer un nouveau compte Mercury
  En tant que Utilisateur je souhaite me conneecter au site Mercury

  @register
  Scenario: Je creer un nouveau compte
    Given Je me connecte sur lapplication Mercury
    When Je click sur le lien register
    And Je saisie le firstname "Karim"
    And Je saisie lastname "Ghommam"
    And Je saisie phone "14785232"
    And Je saisie email "Ghommam692@gmail.com"
    And Je saisie adresse "Mahdia"
    And Je saisie city "Marhdia"
    And Je saisie provance "Mahdia"
    And Je saisie postal code "5141"
    And Je selectionne country "TUNISIA"
    And Je saisie username "Karim"
    And Je saisie une premiere fois password "root"
    And Je confirm password "root"
    And Je clique sur le boutton soumettre
    Then Je me redirige vers la page register_succes " Note: Your user name is Karim."
