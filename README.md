
**Kredencijali:**

**OWNER**:
Email: owner@uns.ac.rs
Lozinka: ownerPassword

**ADMIN**:
Email: admin@uns.ac.rs
Lozinka: adminPassword

**USER**:
Email: user@uns.ac.rs
Lozinka: userPassword


============================    **API Putanje**    ============================


**1. Users Service**

*GET svi korisnici*
**GET** http://localhost:8765/users

*Kreiranje novog korisnika*
**POST** http://localhost:8765/users/newUser

*Izmena korisnika po ID-ju*
**PUT** http://localhost:8765/users/{id}

*Brisanje korisnika po ID-ju*
**DELETE** http://localhost:8765/users/{id}


**2. Currency Exchange**

*Pregled kursnog odnosa*
**GET** http://localhost:8765/currency-exchange?from=EUR&to=RSD


**3. Currency Conversion**

*Konverzija iznosa*
**GET** http://localhost:8765/currency-conversion-feign?from=EUR&to=RSD&quantity=50

**4. Bank Account Service**

*svaki USER vidi samo svoj račun*
**GET** http://localhost:8765/bank-account/user

*ADMIN vidi sve račune u sistemu*
**GET** http://localhost:8765/bank-accounts

*ADMIN vidi račun po email-u*
**GET** http://localhost:8765/bank-accounts/{email}


**5. Crypto Wallet Service**

*ADMIN vidi sve kripto novčanike u sistemu*
**GET** http://localhost:8765/crypto-wallets

*USER vidi samo svoj kripto novčanik*
**GET** http://localhost:8765/crypto-wallet/user

*ADMIN vidi kripto novčanik po email-u*
**GET** http://localhost:8765/crypto-wallets/{email}


**6. Crypto Exchange**

*Kurs kriptovaluta*
**GET** http://localhost:8765/crypto-exchange?from=ETH&to=BTC


**7. Crypto Conversion**

*Konverzija kripta*
**GET** http://localhost:8765/crypto-conversion-feign?from=LTC&to=ETH&quantity=500


**8. Trade Service**

*Trgovina fiat ↔ crypto*
**GET** http://localhost:8765/trade-service?from=EUR&to=BTC&quantity=250