
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDataDto {

    private UUID id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Object authorityList;
    private List<Address> addressList;
}
