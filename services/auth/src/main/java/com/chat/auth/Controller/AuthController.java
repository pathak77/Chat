//package com.chat.auth.Controller;
//
//import com.chat.auth.Repository.RoleRepository;
//import com.chat.auth.Repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController("/auth")
//public class AuthController {
//    @Autowired
//    AuthenticationManager authenticationManager;
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    @Autowired
//    PasswordEncoder encoder;
//
//
//    public ResponseEntity<?> loginController(@Valid @RequestBody LoginRequest loginRequest) {
//
//        Authentication authentication = authenticationManager.authenticate(
//            new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        String jwt = jwtUtils.generateJwtToken(authentication);
//
//        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
//        List<String> roles = userDetails.getAuthorities().stream()
//            .map(item -> item.getAuthority())
//            .collect(Collectors.toList());
//
//        return ResponseEntity.ok(new JwtResponse(jwt,
//            userDetails.getId(),
//            userDetails.getUsername(),
//            userDetails.getEmail(),
//            roles));
//    }
//
//
//}
