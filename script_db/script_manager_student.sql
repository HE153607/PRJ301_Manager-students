create database Manager
create table Student(
studentid varchar(10) not null primary key,
name nvarchar(80)not null,
gender bit not null,
campus nvarchar(50) not null,
email varchar(50) not null,
phonenumber varchar(15) not null,
[address] nvarchar(40)not null,
dob date not null,
img varchar(40)
)
create table [role](
id int not null primary key,
namerole varchar(20) not null
)
create table account(
id varchar(10) not null primary key,
username varchar(50) not null,
pass varchar(20) not null,
roleid int foreign key references [role](id)
)
create table teacher(
id varchar(10) not null foreign key references account(id),
campus nvarchar(50) not null,
email varchar(50) not null,
[name] nvarchar(80) not null,
dob date not null,
img varchar(40),
code varchar(20) not null
primary key(id)
) 
create table class(
id varchar(10) not null foreign key references teacher(id),
studentid varchar(10) not null foreign key references Student(studentid),
primary key(id,studentid)
)
create table parent(
[name] nvarchar(80) not null,
phone varchar(20) not null,
pid varchar(10) not null primary key,
studentid varchar(10) not null foreign key references Student(studentid),
idcard varchar(20) not null
)
create table comment(
stt int IDENTITY(1,1) primary key,
content nvarchar(200) not null,
tid varchar(10) not null foreign key references teacher(id),
dtime date not null,
studentid varchar(10) not null foreign key references Student(studentid)
)
create table datejoin(
djoin date not null,
id varchar(10) not null foreign key references Student(studentid),
primary key(id)
)
create table attend(
attend bit not null,
dtime date not null,
[sid] varchar(10) not null foreign key references Student(studentid),
tid varchar(10) not null foreign key references teacher(id)
)
create table mark(
[sid] varchar(10) foreign key references Student(studentid),
tid varchar(10) foreign key references teacher(id),
[subject] varchar(50) not null,
mark float,
mark_weight int not null,
catgrade varchar(60) not null
)