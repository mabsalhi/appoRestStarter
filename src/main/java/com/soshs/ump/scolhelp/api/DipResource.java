 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soshs.ump.scolhelp.api;

import com.soshs.ump.scolhelp.dao.DiplomeRepository;
import com.soshs.ump.scolhelp.domain.Diplome;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author mabs
 */
@Path("/dip")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DipResource {
    
    @Inject
    private DiplomeRepository dipRepo;
    
    @GET
    public Response getAll(){
        return Response.ok(dipRepo.findAll()).build();
    }
    
    @GET
    @Path("/{codCyc}/{codEtb}/find")
    public Response getDiplomeByCod(@PathParam("codCyc") String codCyc, @PathParam("codEtb") String codEtb){
        System.out.println("Debut d'appel de la resources" + codCyc);
        List<Diplome> Diplome = dipRepo.findDiplomeByCycle(codCyc, codEtb);
        System.out.println("Invocation de la resources terminé");
        return Response.ok(Diplome).build();
    }
    
    
    
//    @GET
//    public Response getIndividuByAppo(@PathParam("apo") Integer apo){
//        Individu individu = individuRepo.findIndividuByAppo(apo);        
//        return Response.ok(individu).build();
//    }
    
  
    
}
