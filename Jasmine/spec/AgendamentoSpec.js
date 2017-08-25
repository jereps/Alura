describe("Agendamento", function() {
    var agenda;
    
    beforeEach(function() {
       agenda = new Agendamento();
        gui = new PacienteBuilder().constroi();
    });
    
    it("deve agendar para 20 dias depois", function() {
        var consulta = new Consulta(gui, [], false, false, new Date(2014, 7, 1));
        var novaconsulta = agenda.para(consulta);
        
        expect(novaconsulta.getData().toString()).toEqual(new Date(2014, 7, 21).toString());
    });
});