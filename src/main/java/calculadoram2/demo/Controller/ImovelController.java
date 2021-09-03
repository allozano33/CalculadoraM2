package calculadoram2.demo.Controller;


import calculadoram2.demo.model.Imovel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImovelController {

    @PostMapping("/imovel")
    public Imovel cadastraImovel(@RequestBody Imovel imovel){
        Imovel imo = new Imovel();
        imo.setNome(imovel.getNome());
        imo.setEndereco(imovel.getEndereco());



        return imovel;


    }



