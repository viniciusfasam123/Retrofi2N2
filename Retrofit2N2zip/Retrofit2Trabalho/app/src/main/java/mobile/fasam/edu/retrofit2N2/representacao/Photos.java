package mobile.fasam.edu.retrofit2N2.representacao;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder

public class Photos {

        private Integer userId;
        private Integer id;
        private String nome;
        private String email;
        private String body;

}
