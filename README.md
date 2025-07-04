# SecureOps Dashboard

A secure, cloud-deployable mission operations dashboard designed to monitor telemetry feeds, log operator activity, and provide real-time system visibility across critical infrastructure environments.

---

## 🧭 Purpose

SecureOps Dashboard provides:

- Real-time telemetry data processing and visualization
- Secure access control and operator logging
- Centralized monitoring across distributed systems
- Scalable deployment pipelines with CI/CD and cloud compatibility
- Modular services that integrate with data pipelines and log analytics tools

The system is designed with modern DevSecOps principles, ensuring resilient, testable, and auditable components ready for integration in high-assurance environments.

---

## 🛠️ Tech Stack

| Layer       | Tools                                |
|-------------|--------------------------------------|
| Backend     | Java (Spring Boot), MongoDB, Hibernate |
| Frontend    | React, TypeScript                    |
| Simulation  | Python (telemetry script)            |
| Logging     | Apache NiFi, Elasticsearch, Kibana   |
| DevOps      | GitLab CI/CD, Docker, AWS (EC2, Fargate, IAM) |
| Testing     | JUnit 5, Mockito                     |
| Auth        | JWT with Role-Based Access Control   |

---

## 🔐 Security & Deployment

- All services secured with JWT tokens and scoped roles
- Modular microservice-compatible architecture
- GitLab CI pipelines for build, test, and deploy stages
- Dockerized environment for consistent local and cloud deployments
- Compatible with on-prem or cloud-native infrastructure

---

## 🚀 Use Cases

- Monitoring drone/sensor feeds in real time
- Role-restricted access to operational logs
- Deployable in hybrid cloud or classified on-prem settings
