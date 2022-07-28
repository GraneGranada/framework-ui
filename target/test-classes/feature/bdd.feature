#Author: marconi@grane.com.br

@executa
Feature: Pesquisar google
  Eu como usuario quero acessar o site para realizar uma pesquisa

  @nExecuta
  Scenario Outline: Pesquisar no google
    Given que eu esteja no "https://www.google.com.br"
    When pesquisar <pesquisar> 
    Then visualizo as <informacoes>

    Examples: 
      |     pesquisar        | informacoes       |
      |     "Banco itaú"     |  "Banco itaú"     |
      |     "Banco bradesco" |  "Banco bradesco" |
     




        Scenario: Pesquisando google
        Given que eu esteja no "https://www.google.com.br"
        When pesquisar "Informação" 
        Then visualizo as "Informação" 