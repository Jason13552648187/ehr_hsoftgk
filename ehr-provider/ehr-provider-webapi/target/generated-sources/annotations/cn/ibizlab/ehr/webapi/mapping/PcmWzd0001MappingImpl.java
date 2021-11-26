package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmWzd0001;
import cn.ibizlab.ehr.webapi.dto.PcmWzd0001DTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmWzd0001MappingImpl implements PcmWzd0001Mapping {

    @Override
    public PcmWzd0001 toDomain(PcmWzd0001DTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmWzd0001 pcmWzd0001 = new PcmWzd0001();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmWzd0001.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmWzd0001.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPeoplenum() != null ) {
            pcmWzd0001.setPeoplenum( dto.getPeoplenum() );
        }
        if ( dto.getBz() != null ) {
            pcmWzd0001.setBz( dto.getBz() );
        }
        if ( dto.getShyy() != null ) {
            pcmWzd0001.setShyy( dto.getShyy() );
        }
        if ( dto.getCsyj() != null ) {
            pcmWzd0001.setCsyj( dto.getCsyj() );
        }
        if ( dto.getCsyy() != null ) {
            pcmWzd0001.setCsyy( dto.getCsyy() );
        }
        if ( dto.getSpyy() != null ) {
            pcmWzd0001.setSpyy( dto.getSpyy() );
        }
        if ( dto.getZpme() != null ) {
            pcmWzd0001.setZpme( dto.getZpme() );
        }
        if ( dto.getWzd0001name() != null ) {
            pcmWzd0001.setWzd0001name( dto.getWzd0001name() );
        }
        if ( dto.getBdsj() != null ) {
            pcmWzd0001.setBdsj( dto.getBdsj() );
        }
        if ( dto.getSpyj() != null ) {
            pcmWzd0001.setSpyj( dto.getSpyj() );
        }
        if ( dto.getYglx() != null ) {
            pcmWzd0001.setYglx( dto.getYglx() );
        }
        if ( dto.getProfilelist() != null ) {
            pcmWzd0001.setProfilelist( dto.getProfilelist() );
        }
        if ( dto.getShyj() != null ) {
            pcmWzd0001.setShyj( dto.getShyj() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmWzd0001.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getWzd0001id() != null ) {
            pcmWzd0001.setWzd0001id( dto.getWzd0001id() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmWzd0001.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmWzd0001.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmWzd0001.setCreatedate( dto.getCreatedate() );
        }

        return pcmWzd0001;
    }

    @Override
    public PcmWzd0001DTO toDto(PcmWzd0001 entity) {
        if ( entity == null ) {
            return null;
        }

        PcmWzd0001DTO pcmWzd0001DTO = new PcmWzd0001DTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmWzd0001DTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmWzd0001DTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPeoplenum() != null ) {
            pcmWzd0001DTO.setPeoplenum( entity.getPeoplenum() );
        }
        if ( entity.getBz() != null ) {
            pcmWzd0001DTO.setBz( entity.getBz() );
        }
        if ( entity.getShyy() != null ) {
            pcmWzd0001DTO.setShyy( entity.getShyy() );
        }
        if ( entity.getCsyj() != null ) {
            pcmWzd0001DTO.setCsyj( entity.getCsyj() );
        }
        if ( entity.getCsyy() != null ) {
            pcmWzd0001DTO.setCsyy( entity.getCsyy() );
        }
        if ( entity.getSpyy() != null ) {
            pcmWzd0001DTO.setSpyy( entity.getSpyy() );
        }
        if ( entity.getZpme() != null ) {
            pcmWzd0001DTO.setZpme( entity.getZpme() );
        }
        if ( entity.getWzd0001name() != null ) {
            pcmWzd0001DTO.setWzd0001name( entity.getWzd0001name() );
        }
        if ( entity.getBdsj() != null ) {
            pcmWzd0001DTO.setBdsj( entity.getBdsj() );
        }
        if ( entity.getSpyj() != null ) {
            pcmWzd0001DTO.setSpyj( entity.getSpyj() );
        }
        if ( entity.getYglx() != null ) {
            pcmWzd0001DTO.setYglx( entity.getYglx() );
        }
        if ( entity.getProfilelist() != null ) {
            pcmWzd0001DTO.setProfilelist( entity.getProfilelist() );
        }
        if ( entity.getShyj() != null ) {
            pcmWzd0001DTO.setShyj( entity.getShyj() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmWzd0001DTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getWzd0001id() != null ) {
            pcmWzd0001DTO.setWzd0001id( entity.getWzd0001id() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmWzd0001DTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmWzd0001DTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmWzd0001DTO.setCreatedate( entity.getCreatedate() );
        }

        return pcmWzd0001DTO;
    }

    @Override
    public List<PcmWzd0001> toDomain(List<PcmWzd0001DTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmWzd0001> list = new ArrayList<PcmWzd0001>( dtoList.size() );
        for ( PcmWzd0001DTO pcmWzd0001DTO : dtoList ) {
            list.add( toDomain( pcmWzd0001DTO ) );
        }

        return list;
    }

    @Override
    public List<PcmWzd0001DTO> toDto(List<PcmWzd0001> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmWzd0001DTO> list = new ArrayList<PcmWzd0001DTO>( entityList.size() );
        for ( PcmWzd0001 pcmWzd0001 : entityList ) {
            list.add( toDto( pcmWzd0001 ) );
        }

        return list;
    }
}
