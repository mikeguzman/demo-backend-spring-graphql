/*
 * Universidad Nacional de Costa Rica  2020
 *
 * mike@guzmanalan.com
 */

package info.backend.model;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entity for the user
 */
@Entity
@Table( name = "USERS" )
public class User {
    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    @Getter
    @Setter
    @GraphQLQuery(name = "idUser", description = "A user's id")
    private Long idUser;
    @Getter
    @Setter
    @GraphQLQuery(name = "firstName", description = "A user's First Name")
    private String firstName;
    @Getter
    @Setter
    @GraphQLQuery(name = "lastName", description = "A user's Last Name")
    private String lastName;
}
