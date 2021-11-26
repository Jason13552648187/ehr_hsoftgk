package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmReason;
import cn.ibizlab.ehr.webapi.dto.PcmReasonDTO;
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
public class PcmReasonMappingImpl implements PcmReasonMapping {

    @Override
    public PcmReason toDomain(PcmReasonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmReason pcmReason = new PcmReason();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmReason.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmReason.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getBz() != null ) {
            pcmReason.setBz( dto.getBz() );
        }
        if ( dto.getPx() != null ) {
            pcmReason.setPx( dto.getPx() );
        }
        if ( dto.getLx() != null ) {
            pcmReason.setLx( dto.getLx() );
        }
        if ( dto.getPcmreasonname() != null ) {
            pcmReason.setPcmreasonname( dto.getPcmreasonname() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmReason.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmReason.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            pcmReason.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            pcmReason.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmReason.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPcmreasonid() != null ) {
            pcmReason.setPcmreasonid( dto.getPcmreasonid() );
        }

        return pcmReason;
    }

    @Override
    public PcmReasonDTO toDto(PcmReason entity) {
        if ( entity == null ) {
            return null;
        }

        PcmReasonDTO pcmReasonDTO = new PcmReasonDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmReasonDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmReasonDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getBz() != null ) {
            pcmReasonDTO.setBz( entity.getBz() );
        }
        if ( entity.getPx() != null ) {
            pcmReasonDTO.setPx( entity.getPx() );
        }
        if ( entity.getLx() != null ) {
            pcmReasonDTO.setLx( entity.getLx() );
        }
        if ( entity.getPcmreasonname() != null ) {
            pcmReasonDTO.setPcmreasonname( entity.getPcmreasonname() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmReasonDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmReasonDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            pcmReasonDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            pcmReasonDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmReasonDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPcmreasonid() != null ) {
            pcmReasonDTO.setPcmreasonid( entity.getPcmreasonid() );
        }

        return pcmReasonDTO;
    }

    @Override
    public List<PcmReason> toDomain(List<PcmReasonDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmReason> list = new ArrayList<PcmReason>( dtoList.size() );
        for ( PcmReasonDTO pcmReasonDTO : dtoList ) {
            list.add( toDomain( pcmReasonDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmReasonDTO> toDto(List<PcmReason> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmReasonDTO> list = new ArrayList<PcmReasonDTO>( entityList.size() );
        for ( PcmReason pcmReason : entityList ) {
            list.add( toDto( pcmReason ) );
        }

        return list;
    }
}
