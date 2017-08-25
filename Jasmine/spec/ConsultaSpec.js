describe("Consulta", function() {
    
   it("deve retorna 0 para consulta retorno", function() {
      var guilherme = new Paciente("Guilherme", 28, 72, 1.80);
      var consulta = new Consulta(guilherme, [], true, true);
       
       expect(consulta.preco()).toEqual(0);
   });
    
   it("deve cobrar 25 por cada procedimento comum", function() {
       var guilherme = new Paciente("Guilherme", 28, 72, 1.80);
       var consulta = new Consulta(guilherme, ["procedi1", "procedi2", "procedi3"], false, false);
       
       expect(consulta.preco()).toEqual(75);
   });
    
   it("deve dobrar o preco da consulta particular", function() {
       var guilherme = new Paciente("Guilherme", 28, 72, 1.80);
       var consulta = new Consulta(guilherme, ["procedi1", "procedi2"], true, false);
       
       expect(consulta.preco()).toEqual(100);
   });
    
   it("deve cobrar preco especifico dependendo do procedimento", function() {
       var guilherme = new Paciente("Guilherme", 28, 72, 1.80);
       var consulta = new Consulta(guilherme, ["procedimento-comum", "raio-x", "procedimento-comum2", "gesso"], false, false);
       
       expect(consulta.preco()).toEqual(25 + 55 + 25 + 32);
   });
    
   it("deve cobrar preco especifico dobrado procedimentos especiais", function() {
       var guilherme = new Paciente("Guilherme", 28, 72, 1.80);
       var consulta = new Consulta(guilherme, ["raio-x", "gesso"], true, false);
       
       expect(consulta.preco()).toEqual((55 + 32) * 2);
   });
    
});