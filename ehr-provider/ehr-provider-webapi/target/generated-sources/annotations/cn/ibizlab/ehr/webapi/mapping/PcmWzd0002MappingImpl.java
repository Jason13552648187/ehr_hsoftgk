package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.PcmWzd0002;
import cn.ibizlab.ehr.webapi.dto.PcmWzd0002DTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmWzd0002MappingImpl implements PcmWzd0002Mapping {

    @Override
    public PcmWzd0002 toDomain(PcmWzd0002DTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmWzd0002 pcmWzd0002 = new PcmWzd0002();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmWzd0002.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmWzd0002.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTcyy() != null ) {
            pcmWzd0002.setTcyy( dto.getTcyy() );
        }
        if ( dto.getJtyy() != null ) {
            pcmWzd0002.setJtyy( dto.getJtyy() );
        }
        if ( dto.getStatus() != null ) {
            pcmWzd0002.setStatus( dto.getStatus() );
        }
        if ( dto.getProfilelist() != null ) {
            pcmWzd0002.setProfilelist( dto.getProfilelist() );
        }
        if ( dto.getPeoplenum() != null ) {
            pcmWzd0002.setPeoplenum( dto.getPeoplenum() );
        }
        if ( dto.getWzd0002name() != null ) {
            pcmWzd0002.setWzd0002name( dto.getWzd0002name() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmWzd0002.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getWzd0002id() != null ) {
            pcmWzd0002.setWzd0002id( dto.getWzd0002id() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmWzd0002.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmWzd0002.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmWzd0002.setUpdatedate( dto.getUpdatedate() );
        }

        return pcmWzd0002;
    }

    @Override
    public PcmWzd0002DTO toDto(PcmWzd0002 entity) {
        if ( entity == null ) {
            return null;
        }

        PcmWzd0002DTO pcmWzd0002DTO = new PcmWzd0002DTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmWzd0002DTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmWzd0002DTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTcyy() != null ) {
            pcmWzd0002DTO.setTcyy( entity.getTcyy() );
        }
        if ( entity.getJtyy() != null ) {
            pcmWzd0002DTO.setJtyy( entity.getJtyy() );
        }
        if ( entity.getStatus() != null ) {
            pcmWzd0002DTO.setStatus( entity.getStatus() );
        }
        if ( entity.getProfilelist() != null ) {
            pcmWzd0002DTO.setProfilelist( entity.getProfilelist() );
        }
        if ( entity.getPeoplenum() != null ) {
            pcmWzd0002DTO.setPeoplenum( entity.getPeoplenum() );
        }
        if ( entity.getWzd0002name() != null ) {
            pcmWzd0002DTO.setWzd0002name( entity.getWzd0002name() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmWzd0002DTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getWzd0002id() != null ) {
            pcmWzd0002DTO.setWzd0002id( entity.getWzd0002id() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmWzd0002DTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmWzd0002DTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmWzd0002DTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pcmWzd0002DTO;
    }

    @Override
    public List<PcmWzd0002> toDomain(List<PcmWzd0002DTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmWzd0002> list = new ArrayList<PcmWzd0002>( dtoList.size() );
        for ( PcmWzd0002DTO pcmWzd0002DTO : dtoList ) {
            list.add( toDomain( pcmWzd0002DTO ) );
        }

        return list;
    }

    @Override
    public List<PcmWzd0002DTO> toDto(List<PcmWzd0002> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmWzd0002DTO> list = new ArrayList<PcmWzd0002DTO>( entityList.size() );
        for ( PcmWzd0002 pcmWzd0002 : entityList ) {
            list.add( toDto( pcmWzd0002 ) );
        }

        return list;
    }
}
