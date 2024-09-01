 <style>
        body {
            display: flex;
            height: 100vh;
        }
        .sidebar {
            width: 250px;
            background: #343a40;
            color: white;
            height: 100%;
            position: fixed;
        }
        .sidebar a {
            color: white;
            text-decoration: none;
        }
        .sidebar a:hover {
            background: #495057;
            color: white;
        }
        .content {
            margin-left: 250px;
            padding: 20px;
            width: 100%;
        }
        .dropdown-menu{
        background-color: darkgray;
        }
    </style>
    
    <div class="sidebar">
        <h2 class="text-center py-3">Admin Dashbord</h2>
        <ul class="nav flex-column">        
           <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Student
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                 <li><a class="dropdown-item" href="Add_Student.jsp">Add Student</a></li>
                                 
                                 <li><a class="dropdown-item" href="List_of_Students.jsp">List of Student</a></li>
                            </ul>
                        </li>
            <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Marks
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                 <li><a class="dropdown-item" href="Add_Marks.jsp">Add Marks</a></li>
                                 
                                 <li><a class="dropdown-item" href="List_of_Marks.jsp">List of Marks</a></li>
                            </ul>
                        </li>
            <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Teacher
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="Add_Teacher.jsp">Add Teacher</a></li>
                                 <li><a class="dropdown-item" href="List_of_Teacher.jsp">List of Teacher</a></li>
                            </ul>
                        </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Settings</a>
            </li>
           
        </ul>
    </div>
    

    <!-- Bootstrap Bundle with Popper -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.bundle.min.js"></script>
