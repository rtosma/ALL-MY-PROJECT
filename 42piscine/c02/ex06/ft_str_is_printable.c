/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_str_is_printable.c                              :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: rosma <42kocaeli.com.tr>                   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/07/25 14:22:00 by rosma             #+#    #+#             */
/*   Updated: 2023/07/25 14:31:53 by rosma            ###   ########.tr       */
/*                                                                            */
/* ************************************************************************** */

int	ft_str_is_printable(char *str)
{
	int	k;

	k = 0;
	while (str[k] != '\0')
	{
		if (!(str[k] >= 32 && str[k] <= 126))
		{
			return (0);
		}
		k++;
	}
	return (1);
}