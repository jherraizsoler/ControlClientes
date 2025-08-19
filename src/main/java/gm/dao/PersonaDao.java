
package gm.dao;

import gm.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**   @author herra  */

public interface PersonaDao extends JpaRepository<Persona, Long>{}
