- standardowo tworzymy model uzytkownika i implementacje interface UserDetails,
- nastepnie konfiguracje PasswordConfig zwracającą PasswordEncoder

Naastępnie SecurityConfig
- potrzebny jest bean dla AuthenticationProvidera, wykorzytującego userservice oraz password encoder,
- AuthenticationManager
- oraz finalnie SecurityFilterChain
domyślnie blokuje wszystkie połączenia, należy ustawić więc regułu wg których połączenia będą możliwe np.
- dla logowania i rejestracji
- pobrania zasobów dostępnych dla niezalogowanych użytkowników

idąc dalej tworzymy UserService z wymaganą implementacją metody loadUserByUsername
następnie filtr dla autoryzacji






POTRZEBNE ZALEŻNOŚCI

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-lang3</artifactId>
		</dependency>