package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmProfileInitNumber;
import cn.ibizlab.ehr.webapi.dto.PcmProfileInitNumberDTO;
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
public class PcmProfileInitNumberMappingImpl implements PcmProfileInitNumberMapping {

    @Override
    public PcmProfileInitNumber toDomain(PcmProfileInitNumberDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmProfileInitNumber pcmProfileInitNumber = new PcmProfileInitNumber();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmProfileInitNumber.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmProfileInitNumber.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYglx() != null ) {
            pcmProfileInitNumber.setYglx( dto.getYglx() );
        }
        if ( dto.getInitnum() != null ) {
            pcmProfileInitNumber.setInitnum( dto.getInitnum() );
        }
        if ( dto.getPcmprofileinitnumbername() != null ) {
            pcmProfileInitNumber.setPcmprofileinitnumbername( dto.getPcmprofileinitnumbername() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmProfileInitNumber.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmProfileInitNumber.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmProfileInitNumber.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmprofileinitnumberid() != null ) {
            pcmProfileInitNumber.setPcmprofileinitnumberid( dto.getPcmprofileinitnumberid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmProfileInitNumber.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmProfileInitNumber.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmProfileInitNumber.setOrmorgname( dto.getOrmorgname() );
        }

        return pcmProfileInitNumber;
    }

    @Override
    public PcmProfileInitNumberDTO toDto(PcmProfileInitNumber entity) {
        if ( entity == null ) {
            return null;
        }

        PcmProfileInitNumberDTO pcmProfileInitNumberDTO = new PcmProfileInitNumberDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmProfileInitNumberDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmProfileInitNumberDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYglx() != null ) {
            pcmProfileInitNumberDTO.setYglx( entity.getYglx() );
        }
        if ( entity.getInitnum() != null ) {
            pcmProfileInitNumberDTO.setInitnum( entity.getInitnum() );
        }
        if ( entity.getPcmprofileinitnumbername() != null ) {
            pcmProfileInitNumberDTO.setPcmprofileinitnumbername( entity.getPcmprofileinitnumbername() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmProfileInitNumberDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmProfileInitNumberDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmProfileInitNumberDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmprofileinitnumberid() != null ) {
            pcmProfileInitNumberDTO.setPcmprofileinitnumberid( entity.getPcmprofileinitnumberid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmProfileInitNumberDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmProfileInitNumberDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmProfileInitNumberDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pcmProfileInitNumberDTO;
    }

    @Override
    public List<PcmProfileInitNumber> toDomain(List<PcmProfileInitNumberDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmProfileInitNumber> list = new ArrayList<PcmProfileInitNumber>( dtoList.size() );
        for ( PcmProfileInitNumberDTO pcmProfileInitNumberDTO : dtoList ) {
            list.add( toDomain( pcmProfileInitNumberDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmProfileInitNumberDTO> toDto(List<PcmProfileInitNumber> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmProfileInitNumberDTO> list = new ArrayList<PcmProfileInitNumberDTO>( entityList.size() );
        for ( PcmProfileInitNumber pcmProfileInitNumber : entityList ) {
            list.add( toDto( pcmProfileInitNumber ) );
        }

        return list;
    }
}
