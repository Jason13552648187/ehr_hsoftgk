package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmLog;
import cn.ibizlab.ehr.webapi.dto.PcmLogDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmLogMappingImpl implements PcmLogMapping {

    @Override
    public PcmLog toDomain(PcmLogDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmLog pcmLog = new PcmLog();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmLog.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmLog.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOptdeid() != null ) {
            pcmLog.setOptdeid( dto.getOptdeid() );
        }
        if ( dto.getType() != null ) {
            pcmLog.setType( dto.getType() );
        }
        if ( dto.getOptdeaction() != null ) {
            pcmLog.setOptdeaction( dto.getOptdeaction() );
        }
        if ( dto.getOptdename() != null ) {
            pcmLog.setOptdename( dto.getOptdename() );
        }
        if ( dto.getSfsx() != null ) {
            pcmLog.setSfsx( dto.getSfsx() );
        }
        if ( dto.getPcmlogname() != null ) {
            pcmLog.setPcmlogname( dto.getPcmlogname() );
        }
        if ( dto.getContent() != null ) {
            pcmLog.setContent( dto.getContent() );
        }
        if ( dto.getOptcontent() != null ) {
            pcmLog.setOptcontent( dto.getOptcontent() );
        }
        if ( dto.getNeedopt() != null ) {
            pcmLog.setNeedopt( dto.getNeedopt() );
        }
        if ( dto.getSxrq() != null ) {
            pcmLog.setSxrq( dto.getSxrq() );
        }
        if ( dto.getYgbh() != null ) {
            pcmLog.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmLog.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPcmlogid() != null ) {
            pcmLog.setPcmlogid( dto.getPcmlogid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmLog.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmLog.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmLog.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmLog.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgid() != null ) {
            pcmLog.setOrgid( dto.getOrgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmLog.setPimpersonname( dto.getPimpersonname() );
        }

        return pcmLog;
    }

    @Override
    public PcmLogDTO toDto(PcmLog entity) {
        if ( entity == null ) {
            return null;
        }

        PcmLogDTO pcmLogDTO = new PcmLogDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmLogDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmLogDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOptdeid() != null ) {
            pcmLogDTO.setOptdeid( entity.getOptdeid() );
        }
        if ( entity.getType() != null ) {
            pcmLogDTO.setType( entity.getType() );
        }
        if ( entity.getOptdeaction() != null ) {
            pcmLogDTO.setOptdeaction( entity.getOptdeaction() );
        }
        if ( entity.getOptdename() != null ) {
            pcmLogDTO.setOptdename( entity.getOptdename() );
        }
        if ( entity.getSfsx() != null ) {
            pcmLogDTO.setSfsx( entity.getSfsx() );
        }
        if ( entity.getPcmlogname() != null ) {
            pcmLogDTO.setPcmlogname( entity.getPcmlogname() );
        }
        if ( entity.getContent() != null ) {
            pcmLogDTO.setContent( entity.getContent() );
        }
        if ( entity.getOptcontent() != null ) {
            pcmLogDTO.setOptcontent( entity.getOptcontent() );
        }
        if ( entity.getNeedopt() != null ) {
            pcmLogDTO.setNeedopt( entity.getNeedopt() );
        }
        if ( entity.getSxrq() != null ) {
            pcmLogDTO.setSxrq( entity.getSxrq() );
        }
        if ( entity.getYgbh() != null ) {
            pcmLogDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmLogDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPcmlogid() != null ) {
            pcmLogDTO.setPcmlogid( entity.getPcmlogid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmLogDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmLogDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmLogDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmLogDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgid() != null ) {
            pcmLogDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmLogDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pcmLogDTO;
    }

    @Override
    public List<PcmLog> toDomain(List<PcmLogDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmLog> list = new ArrayList<PcmLog>( dtoList.size() );
        for ( PcmLogDTO pcmLogDTO : dtoList ) {
            list.add( toDomain( pcmLogDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmLogDTO> toDto(List<PcmLog> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmLogDTO> list = new ArrayList<PcmLogDTO>( entityList.size() );
        for ( PcmLog pcmLog : entityList ) {
            list.add( toDto( pcmLog ) );
        }

        return list;
    }
}
