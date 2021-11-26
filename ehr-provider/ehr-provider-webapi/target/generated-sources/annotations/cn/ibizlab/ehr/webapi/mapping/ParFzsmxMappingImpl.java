package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParFzsmx;
import cn.ibizlab.ehr.webapi.dto.ParFzsmxDTO;
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
public class ParFzsmxMappingImpl implements ParFzsmxMapping {

    @Override
    public ParFzsmx toDomain(ParFzsmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParFzsmx parFzsmx = new ParFzsmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parFzsmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parFzsmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParfzsmxname() != null ) {
            parFzsmx.setParfzsmxname( dto.getParfzsmxname() );
        }
        if ( dto.getBzsm() != null ) {
            parFzsmx.setBzsm( dto.getBzsm() );
        }
        if ( dto.getLdpx() != null ) {
            parFzsmx.setLdpx( dto.getLdpx() );
        }
        if ( dto.getPimpersonid() != null ) {
            parFzsmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPartzggid() != null ) {
            parFzsmx.setPartzggid( dto.getPartzggid() );
        }
        if ( dto.getCreatedate() != null ) {
            parFzsmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getParfzsmxid() != null ) {
            parFzsmx.setParfzsmxid( dto.getParfzsmxid() );
        }
        if ( dto.getUpdateman() != null ) {
            parFzsmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            parFzsmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parFzsmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            parFzsmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getSszz() != null ) {
            parFzsmx.setSszz( dto.getSszz() );
        }
        if ( dto.getPartzggname() != null ) {
            parFzsmx.setPartzggname( dto.getPartzggname() );
        }
        if ( dto.getSsbm() != null ) {
            parFzsmx.setSsbm( dto.getSsbm() );
        }

        return parFzsmx;
    }

    @Override
    public ParFzsmxDTO toDto(ParFzsmx entity) {
        if ( entity == null ) {
            return null;
        }

        ParFzsmxDTO parFzsmxDTO = new ParFzsmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parFzsmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parFzsmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParfzsmxname() != null ) {
            parFzsmxDTO.setParfzsmxname( entity.getParfzsmxname() );
        }
        if ( entity.getBzsm() != null ) {
            parFzsmxDTO.setBzsm( entity.getBzsm() );
        }
        if ( entity.getLdpx() != null ) {
            parFzsmxDTO.setLdpx( entity.getLdpx() );
        }
        if ( entity.getPimpersonid() != null ) {
            parFzsmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPartzggid() != null ) {
            parFzsmxDTO.setPartzggid( entity.getPartzggid() );
        }
        if ( entity.getCreatedate() != null ) {
            parFzsmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getParfzsmxid() != null ) {
            parFzsmxDTO.setParfzsmxid( entity.getParfzsmxid() );
        }
        if ( entity.getUpdateman() != null ) {
            parFzsmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            parFzsmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parFzsmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            parFzsmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getSszz() != null ) {
            parFzsmxDTO.setSszz( entity.getSszz() );
        }
        if ( entity.getPartzggname() != null ) {
            parFzsmxDTO.setPartzggname( entity.getPartzggname() );
        }
        if ( entity.getSsbm() != null ) {
            parFzsmxDTO.setSsbm( entity.getSsbm() );
        }

        return parFzsmxDTO;
    }

    @Override
    public List<ParFzsmx> toDomain(List<ParFzsmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParFzsmx> list = new ArrayList<ParFzsmx>( dtoList.size() );
        for ( ParFzsmxDTO parFzsmxDTO : dtoList ) {
            list.add( toDomain( parFzsmxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParFzsmxDTO> toDto(List<ParFzsmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParFzsmxDTO> list = new ArrayList<ParFzsmxDTO>( entityList.size() );
        for ( ParFzsmx parFzsmx : entityList ) {
            list.add( toDto( parFzsmx ) );
        }

        return list;
    }
}
