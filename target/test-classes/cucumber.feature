#Author: marconi@marconi.com.br


Feature: Realizar pesquisa google
  Eu como usuario quero acessar o site para realizar uma pesquisa

 Background: Acessar o google 
 Given que eu esteja no "https://www.google.com.br"

 Scenario: Pesquisar E2E Treinamentos
    When pesquisar "Estudo"
    Then valido nome "Estudo"

    Scenario: Pesquisar Inovacao
    When pesquisar "Inovação"
    Then valido nome "Inovação"
    
    Scenario: Pesquisar Felicidade
    When pesquisar "Felicidade"
    Then valido nome "Felicidade"