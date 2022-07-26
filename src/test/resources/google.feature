#Author: marconi.oliveira@e2etreinamentos.com.br


Feature: Pesquisar google
  Eu como usuario quero acessar o site para realizar uma pesquisa


 Scenario: Pesquisar o nome da escola no google
    Given que eu esteja no "https://www.google.com.br"
    When pesquisar o nome da escola
    Then valido as informacoes

 