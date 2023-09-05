use apartman

/****** Object: Table [dbo].[borc_tipi] Script Date: 25.02.2020 01:19:54 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[borc_tipi](
[id] [int] IDENTITY(1,1) NOT NULL,
[borc_tipi] [nvarchar](50) NULL,
[aciklama] [nvarchar](50) NULL,
CONSTRAINT [PK_borc_tipi] PRIMARY KEY CLUSTERED
(
[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]) ON [PRIMARY]

GO