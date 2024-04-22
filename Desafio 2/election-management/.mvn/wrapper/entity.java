// Candidato.java
@Entity
public class Candidato extends PanacheEntity {
    public String nome;
    public String partido;
}

// CandidatoResource.java
@Path("/candidatos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CandidatoResource {

    @GET
    public List<Candidato> getCandidatos() {
        return Candidato.listAll();
    }

    @POST
    public Response addCandidato(Candidato candidato) {
        candidato.persist();
        return Response.status(Status.CREATED).entity(candidato).build();
    }
}