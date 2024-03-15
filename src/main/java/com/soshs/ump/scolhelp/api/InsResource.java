 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soshs.ump.scolhelp.api;

import com.soshs.ump.scolhelp.dao.InsAdmEtpRepository;
import com.soshs.ump.scolhelp.domain.InsAdmEtp;
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
@Path("/insc")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InsResource {
    
    @Inject
    private InsAdmEtpRepository insRepo;
    
    @GET
    public Response getAll(){
        return Response.ok(insRepo.findAll()).build();
    }
    
    @GET
    @Path("/{codInd}/find")
    public Response getIndividuByCIN(@PathParam("codInd") Long codInd){
        System.out.println("Debut d'appel de la resources" + codInd);
        List<InsAdmEtp> inscIND = insRepo.findInsAdmEtpByInd(codInd);  
        System.out.println("Invocation de la resources terminé");
        return Response.ok(inscIND).build();
    }
    
    @GET
    @Path("/{id}/insc")
    public Response getListInsID(@PathParam("id") Long id){
        System.out.println("Debut d'appel de la resources" + id);
        List<InsAdmEtp> listIns = insRepo.findInsAdmEtpByInd(id);
        System.out.println("Invocation de la resources terminé");
        return Response.ok(insRepo.findInsAdmEtpByInd(id)).build();
    }
    
//    @GET
//    public Response getIndividuByAppo(@PathParam("apo") Integer apo){
//        Individu individu = individuRepo.findIndividuByAppo(apo);        
//        return Response.ok(individu).build();
//    }
    
  
    
}
