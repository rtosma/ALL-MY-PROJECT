use apartman

/****** Object: Table [dbo].[log] Script Date: 25.02.2020 01:22:25 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[log](
[id] [int] IDENTITY(1,1) NOT NULL,
[islem] [nvarchar](50) NULL,
[ip] [nvarchar](50) NULL,
[tc] [nvarchar](50) NULL,
[aciklama] [nvarchar](50) NULL,
[tarih] [nvarchar](50) NULL,
CONSTRAINT [PK_log] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]

GO