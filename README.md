# RolePolicyVerifierrr-by-Micha-K
Instrukcje uruchomienia IAMRolePolicyVerifier:

1. Przygotowanie pliku JSON:
   - Upewnij się, że masz plik JSON zawierający politykę roli IAM.
   - Nazwij plik "input.json" lub zmień nazwę w kodzie źródłowym w przypadku używania innego nazewnictwa.
   - Do pliku input.json wklej podaną poniżej informację:
{
  "Resource": "arn:aws:s3:::example_bucket/*",
  "Action": "s3:GetObject",
  "Effect": "Allow"
}


2. Uruchomienie programu:
   - Upewnij się, że masz zainstalowane środowisko Java na swoim komputerze.
   - Skompiluj plik IAMRolePolicyVerifier.java za pomocą polecenia javac:
     ```
     javac IAMRolePolicyVerifier.java
     ```
   - Uruchom program za pomocą polecenia java:
     ```
     java IAMRolePolicyVerifier
     ```

3. Rezultat:
   - Po uruchomieniu programu zostanie wyświetlony komunikat informujący, czy dane wejściowe są poprawne na podstawie analizy pliku JSON.

