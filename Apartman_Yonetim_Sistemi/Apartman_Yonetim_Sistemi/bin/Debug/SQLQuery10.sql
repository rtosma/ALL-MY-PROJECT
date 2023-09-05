use apartman

/****** Object: Table [dbo].[kullanici] Script Date: 25.02.2020 01:21:58 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[kullanici](
[id] [int] IDENTITY(1,1) NOT NULL,
[tc_no] [nvarchar](50) NOT NULL,
[soyisim] [nvarchar](50) NULL,
[email] [nvarchar](50) NULL,
[telefon] [nvarchar](50) NULL,
[apartman_id] [int] NULL,
[daire_no] [nvarchar](50) NULL,
[ev_durumu] [nvarchar](50) NULL,
[rol] [nvarchar](50) NULL,
[sifre] [nvarchar](50) NULL,
[ad] [nvarchar](50) NULL,
CONSTRAINT [PK_kullanici] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]

GO