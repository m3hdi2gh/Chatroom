# 🗨️ Chatroom
A simple, interactive chatroom application built using Java. This project includes a `Server` class for managing connections and broadcasting and a `Client` class for joining the chatroom and real-time communication.

## 📌 Table of Contents
- [🌟 Features](#features)
- [📁 Code Structure](#code-structure)
- [⬇️ Installation](#installation)
- [💡 Future Improvements](#future-improvements)
- [📚 Requirements](#requirements)
- [🤝 Contributing](#contributing)
- [📧 Contact](#contact)
- [🎉 Enjoy using Chatroom!](#enjoy-using-chatroom)

## 🌟 Features
- 🗨️ Real-time messaging between multiple clients
- 💻 User-friendly command-line interface
- 👥 Automatic handling of multiple client connections
- 📡 Broadcasting messages to all connected clients
- 📄 Simple and clean code structure for easy understanding and modification

## 📁 Code Structure
The project consists of two main classes:

1. **Server** 🖥️:
   - Manages incoming client connections.
   - Broadcast messages to all connected clients.
   - Contains a nested `ClientHandler` class for individual client communication.

2. **Client** 💻:
   - Connects to the server and joins the chatroom.
   - Reads user input from the command line and sends it to the server.
   - Receives and displays messages from the server.

## ⬇️ Installation
To run this project locally, follow these steps:

1. **Clone the repository** 🐙:
    ```bash
    git clone https://github.com/your-username/chatroom.git
    cd chatroom
    ```

2. **Compile the code** 🔧:
    ```bash
    javac Server.java Client.java
    ```

3. **Run the Server** 🚀:
    ```bash
    java Server
    ```

4. **Run the Client(s)** 🗨️:
    ```bash
    java Client
    ```

## 💡 Future Improvements
- 🎨 Enhance user interface with a graphical client.
- 🔒 Add user authentication and registration.
- 📨 Implement private messaging between users.
- ⚠️ Improve error handling and logging.
- 📎 Add support for different message formats (e.g., images, files).

## 📚 Requirements
- ☕ Java Development Kit (JDK) 8 or higher
- ⌨️ A command-line terminal

## 🤝 Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## 📧 Contact
For any questions, feel free to reach out to me at `m3hdigholami@aut.ac.ir`.

## 🎉 Enjoy using Chatroom!
I hope you find this chatroom application useful and fun to use. Happy chatting!
