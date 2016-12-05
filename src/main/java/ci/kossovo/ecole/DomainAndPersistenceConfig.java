package ci.kossovo.ecole;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class DomainAndPersistenceConfig implements CommandLineRunner{
//	private static final Logger log = LoggerFactory.getLogger(DomainAndPersistenceConfig.class);
/*@Autowired
PersonneRepository personneRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(DomainAndPersistenceConfig.class, args);
		//IPersonnetMetier repository =ctx.getBean(IPersonnetMetier.)
	}

@Override
public void run(String... args) throws Exception {
	/*personneRepository.save(new Personne("Mr", "Jack", "Bauer","CNI0021"));
	personneRepository.save(new Personne("Mlle", "Chloe", "O'Brian","CNI0022"));
	personneRepository.save(new Etudiant("Mr", "Traore", "Abou","CNI0023", "E00102"));
	personneRepository.save(new Etudiant("Mr", "Koné", "Moussa","CNI0024", "E00103"));
	personneRepository.save(new Etudiant("Mr", "Bamba", "Abou","CNI0028", "E00101"));
	personneRepository.save(new Enseignant("Mme", "Koné", "Asta","CNI0121", "Active"));
	personneRepository.save(new Enseignant("Mr", "Kanté", "Bakary","CNI0421", "Active"));
	personneRepository.save(new Enseignant("Mme", "Fofana", "Fanta","CNI0041", "Active"));
	personneRepository.save(new Administrateur("Mr", "Kaba", "Mawa","CNI0065", "Censeur"));
	personneRepository.save(new Administrateur("Mme", "Fofana", "Sita","CNI0033", "Comptable"));
	personneRepository.save(new Administrateur("Mme", "Diomandé", "Mariam","CNI00541", "Directeur etude"));*/
	
}
	
	
	/*@Bean
	public CommandLineRunner personneMetier(IPersonnetMetier repository) {
		return (args) -> {
			// save a couple of customers
			repository.creer(new Personne("Mr", "Jack", "Bauer"));
			repository.creer(new Personne("Mlle", "Chloe", "O'Brian"));
			repository.creer(new Etudiant("Mr", "Traore", "Abou", "E00102"));
			repository.creer(new Etudiant("Mr", "Koné", "Moussa", "E00103"));
			repository.creer(new Etudiant("Mr", "Bamba", "Abou", "E00101"));
			repository.creer(new Enseignant("Mme", "Koné", "Asta", "Active"));
			repository.creer(new Enseignant("Mr", "Kanté", "Bakary", "Active"));
			repository.creer(new Enseignant("Mme", "Fofana", "Fanta", "Active"));
			repository.creer(new Administrateur("Mr", "Kaba", "Mawa", "Censeur"));
			repository.creer(new Administrateur("Mme", "Fofana", "Sita", "Comptable"));
			repository.creer(new Administrateur("Mme", "Diomandé", "Mariam", "Directeur etude"));
			

			// fetch all customers
//			log.info("Personne found with findAll():");
			log.info("-------------------------------");
			for (Personne p : repository.userAll()) {
				log.info(p.toString());
			}
            log.info("");

			// fetch an individual customer by ID
			Personne p = repository.find(1L);
//			log.info("Personne found with findOne(1L):");
			log.info("--------------------------------");
			log.info(p.toString());
            log.info("");
            
//            log.info("Personne adresse de findOne(10L):");
            log.info("--------------------------------");
            List<String> contacts= new ArrayList<>();
			contacts.add("05-54-25-54");
			contacts.add("47-21-25-87");
			Adresse ad= new Adresse();
			ad.setContacts(contacts);
			Personne p2 = repository.find(10L);
			p2.setAdresse(ad);
			repository.modifier(p2);
		     p2 = repository.find(10L);
			log.info("Le contact de "+p2.toString());
            for (String s : p2.getAdresse().getContacts()) {
				log.info(s);
			}
            log.info("");

			// fetch customers by last name
//			log.info("Etudiant found with matricule):");
			log.info("--------------------------------------------");
			Personne em = repository.chercherParMatricule("E00103");
			log.info(em.toString());
            log.info("");
            // fetch customers by last name et firstname
//            log.info("Etudiant found with chercherEtudiantParMc:");
            log.info("--------------------------------------------");
            repository.chercherEtudiantParMc("a").forEach(e->log.info(e.toString()));
            for (Personne bauer : repository.chercherEtudiantParMc("k")) {
            	log.info(bauer.toString());
            }
            log.info("");
            
            // fetch customers by last name et firstname
//            log.info("Enseignant found with listEnseignants");
            log.info("--------------------------------------------");
            for (Personne e : repository.listEnseignants()) {
            	log.info(e.toString());
            }
            log.info("");
            // fetch customers by last name et firstname
//            log.info("Etudiant found with listEtudiants");
            log.info("--------------------------------------------");
            for (Personne e : repository.listEtudiants()) {
            	log.info(e.toString());
            }
            log.info("");
            // fetch customers  contient a
//            log.info("Enseignant chercherEnseignantParMc('a'):");
            log.info("--------------------------------------------");
            for (Personne e : repository.chercherEnseignantParMc("a")) {
            	log.info(e.toString());
            }
            log.info("");
            // fetch customers  contient a
//            log.info("Administrateur chercherAdministrateurParMc 'm':");
            log.info("--------------------------------------------");
            for (Personne a : repository.chercherAdministrateurParMc("m")) {
            	log.info(a.toString());
            }
            log.info("");
            // fetch customers  contient a
            log.info("Customer found with findByNomCompletContainingIgnoreCase('m')");
            log.info("--------------------------------------------");
            for (Customer bauer : repository.findByNomCompletContainingIgnoreCase("m")) {
            	log.info(bauer.toString());
            }
            log.info("");
		};

	}
	
	
	@Bean
	CommandLineRunner matiereMetier(IMatiereMetier matiereMetier){
		return(args)->{
			
		};
	}
	
	
	@Bean
	CommandLineRunner promtionMetier(IMatiereMetier matiereMetier){
		return(args)->{
			
		};
	}
	
	
	@Bean
	CommandLineRunner coursMetier(IMatiereMetier matiereMetier){
		return(args)->{
			
		};
	}*/
}
