package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParZnbmmx;
import cn.ibizlab.ehr.webapi.dto.ParZnbmmxDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParZnbmmxMappingImpl implements ParZnbmmxMapping {

    @Override
    public ParZnbmmx toDomain(ParZnbmmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParZnbmmx parZnbmmx = new ParZnbmmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parZnbmmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parZnbmmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParznbmmxname() != null ) {
            parZnbmmx.setParznbmmxname( dto.getParznbmmxname() );
        }
        if ( dto.getBzsm() != null ) {
            parZnbmmx.setBzsm( dto.getBzsm() );
        }
        if ( dto.getPartzggid() != null ) {
            parZnbmmx.setPartzggid( dto.getPartzggid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            parZnbmmx.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getUpdatedate() != null ) {
            parZnbmmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parZnbmmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            parZnbmmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getParznbmmxid() != null ) {
            parZnbmmx.setParznbmmxid( dto.getParznbmmxid() );
        }
        if ( dto.getCreatedate() != null ) {
            parZnbmmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            parZnbmmx.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getSszz() != null ) {
            parZnbmmx.setSszz( dto.getSszz() );
        }
        if ( dto.getOrdervalue() != null ) {
            parZnbmmx.setOrdervalue( dto.getOrdervalue() );
        }
        if ( dto.getPartzggname() != null ) {
            parZnbmmx.setPartzggname( dto.getPartzggname() );
        }

        return parZnbmmx;
    }

    @Override
    public ParZnbmmxDTO toDto(ParZnbmmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParZnbmmxDTO parZnbmmxDTO = new ParZnbmmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parZnbmmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parZnbmmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParznbmmxname() != null ) {
            parZnbmmxDTO.setParznbmmxname( entity.getParznbmmxname() );
        }
        if ( entity.getBzsm() != null ) {
            parZnbmmxDTO.setBzsm( entity.getBzsm() );
        }
        if ( entity.getPartzggid() != null ) {
            parZnbmmxDTO.setPartzggid( entity.getPartzggid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            parZnbmmxDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getUpdatedate() != null ) {
            parZnbmmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parZnbmmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            parZnbmmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getParznbmmxid() != null ) {
            parZnbmmxDTO.setParznbmmxid( entity.getParznbmmxid() );
        }
        if ( entity.getCreatedate() != null ) {
            parZnbmmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            parZnbmmxDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getSszz() != null ) {
            parZnbmmxDTO.setSszz( entity.getSszz() );
        }
        if ( entity.getOrdervalue() != null ) {
            parZnbmmxDTO.setOrdervalue( entity.getOrdervalue() );
        }
        if ( entity.getPartzggname() != null ) {
            parZnbmmxDTO.setPartzggname( entity.getPartzggname() );
        }

        return parZnbmmxDTO;
    }

    @Override
    public List<ParZnbmmx> toDomain(List<ParZnbmmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParZnbmmx> list = new ArrayList<ParZnbmmx>( dtoList.size() );
        for ( ParZnbmmxDTO parZnbmmxDTO : dtoList ) {
            list.add( toDomain( parZnbmmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParZnbmmxDTO> toDto(List<ParZnbmmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParZnbmmxDTO> list = new ArrayList<ParZnbmmxDTO>( entityList.size() );
        for ( ParZnbmmx parZnbmmx : entityList ) {
            list.add( toDto( parZnbmmx ) );
        }

        return list;
    }
}
