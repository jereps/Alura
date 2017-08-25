describe("Consulta", function() {
    
    var guilherme;
    
    beforeEach(function() {
        guilherme = new PacienteBuilder().constroi();
    });
    
   describe("teste de Consulta com retorno", function() {
   it("deve retorna 0 para consulta retorno", function() {
      var consulta = new Consulta(guilherme, [], true, true);
       
       expect(consulta.preco()).toEqual(0);
     });
    
  });
       
    describe("teste de Consulta com convénio", function(){
        
   it("deve cobrar 25 por cada procedimento comum", function() {
       var consulta = new Consulta(guilherme, ["procedi1", "procedi2", "procedi3"], false, false);
       
       expect(consulta.preco()).toEqual(75);
      });
    
        
   it("deve cobrar preco especifico dependendo do procedimento", function() {
       var consulta = new Consulta(guilherme, ["procedimento-comum", "raio-x", "procedimento-comum2", "gesso"], false, false);
       
       expect(consulta.preco()).toEqual(25 + 55 + 25 + 32);
     });
  });

    
    describe("teste de Consulta particular", function() {
    it("deve dobrar o preco da consulta particular", function() {
       var consulta = new Consulta(guilherme, ["procedi1", "procedi2"], true, false);
       
       expect(consulta.preco()).toEqual(100);
      });
        
    it("deve cobrar preco especifico dobrado procedimentos especiais", function() {
       var consulta = new Consulta(guilherme, ["raio-x", "gesso"], true, false);
       
       expect(consulta.preco()).toEqual((55 + 32) * 2);
     });
        
   });
    
});