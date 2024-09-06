



LOCAL:


grpcurl -d '{"loan_app_id": "1000", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Submit


grpcurl -d '{"loan_app_id": "1000"}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Get

grpcurl -d '{"loan_app_id": "1000"}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Approve

grpcurl -d '{"loan_app_id": "1000", "reason": "Declined"}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Decline

grpcurl -d '{"loan_app_id": "1000"}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Get




REMOTE:




grpcurl -d '{"loanAppId": "2000", "clientId": "client100", "clientMonthlyIncomeCents": 100000, "loanAmountCents": 200000, "loanDurationMonths": 28}' super-snow-8822.eu-central-1.kalix.app:443 io.kx.loanapp.api.LoanAppService/Submit

grpcurl -d '{"loan_app_id": "2000"}' super-snow-8822.eu-central-1.kalix.app:443 io.kx.loanapp.api.LoanAppService/Get


grpcurl -d '{"loan_app_id": "2000"}' super-snow-8822.eu-central-1.kalix.app:443 io.kx.loanapp.api.LoanAppService/Approve


grpcurl -d '{"loan_app_id": "2000"}' super-snow-8822.eu-central-1.kalix.app:443 io.kx.loanapp.api.LoanAppService/Get



super-snow-8822.eu-central-1.kalix.appS:

Local
########

grpcurl -d '{"loan_app_id": "1000", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Submit

grpcurl -d '{"loan_app_id": "2000", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Submit

grpcurl -d '{"loan_app_id": "3000", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Submit

grpcurl -d '{"loan_app_id": "1000"}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Approve
grpcurl -d '{"loan_app_id": "3000"}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Approve


curl -X POST http://localhost:9000/loanapp/views/by-status \
--header 'Content-Type: application/json' \
--data '{"status_id": 2}'

grpcurl -d '{"status_id": 2}' -plaintext localhost:9000 io.kx.loanapp.super-snow-8822.eu-central-1.kalix.app.LoanAppByStatus/GetLoanAppByStatus

Remote
########

grpcurl -d '{"status_id": 2}' spring-salad-4981.eu-central-1.kalix.app:443 io.kx.loanapp.super-snow-8822.eu-central-1.kalix.app.LoanAppByStatus/GetLoanAppByStatus


curl -X POST http://spring-salad-4981.eu-central-1.kalix.app/loanapp/super-snow-8822.eu-central-1.kalix.apps/by-status \
--header 'Content-Type: application/json' \
--data '{"status_id": 1}'



ACTIONS:

curl --location 'https://spring-salad-4981.eu-central-1.kalix.app/loanapp/create' \
--header 'Content-Type: application/json' \
--data '{"loan_app_id": "4000", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}'

curl --location 'http://localhost:9000/loanapp/create' \
--header 'Content-Type: application/json' \
--data '{"loan_app_id": "2000", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}'

curl --location 'http://localhost:9000/loanapp/approve' \
--header 'Content-Type: application/json' \
--data '{"loan_app_id": "10003"}'



 

curl --location 'http://localhost:9000/loanapp/create' \
--header 'Content-Type: application/json' \
--data '{"loan_app_id": "5000", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}'


grpcurl -d '{"loan_app_id": "5000"}' -plaintext localhost:9000 io.kx.loanapp.api.LoanAppService/Approve

curl --location 'http://localhost:9000/loanapp/create' \
--header 'Content-Type: application/json' \
--data '{"loan_app_id": "10001", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}'

curl --location 'http://localhost:9000/loanapp/create' \
--header 'Content-Type: application/json' \
--data '{"loan_app_id": "10000", "client_id": "client100", "client_monthly_income_cents": 100000, "loan_amount_cents": 200000, "loan_duration_months": 28}'

