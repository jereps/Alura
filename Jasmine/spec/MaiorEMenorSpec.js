describe("Maior e Menor", function() {
    
    it("deve entender numeros em ordem nao sequencial", function() {
        var algoritmo = new MaiorEMenor();
        algoritmo.encontra([5,15,7,9]);
        
        expect(algoritmo.pegaMaior()).toEqual(15);
        expect(algoritmo.pegaMenor()).toEqual(5);
        
    });
    
    it("deve entender numeros em ordem decrescente", function() {
        var algoritmo = new MaiorEMenor();
        algoritmo.encontra([9,8,7,6]);
        
        expect(algoritmo.pegaMaior()).toEqual(9);
        expect(algoritmo.pegaMenor()).toEqual(6);
    });
    
    it("deve entender numeros em ordem crescente", function() {
        var algoritmo = new MaiorEMenor();
        algoritmo.encontra([5,6,10,15,25]);
        
        expect(algoritmo.pegaMaior()).toEqual(25);
        expect(algoritmo.pegaMenor()).toEqual(5);
    });
    
    it("deve entender numero com um elemento", function() {
       var algoritmo = new MaiorEMenor();
        algoritmo.encontra([1]);
        
        expect(algoritmo.pegaMaior()).toEqual(1);
        expect(algoritmo.pegaMenor()).toEqual(1);
    });
    
});

