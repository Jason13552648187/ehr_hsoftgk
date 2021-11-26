package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimPaper;
import cn.ibizlab.ehr.webapi.dto.PimPaperDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimPaperMappingImpl implements PimPaperMapping {

    @Override
    public PimPaper toDomain(PimPaperDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimPaper pimPaper = new PimPaper();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimPaper.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimPaper.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getGrzlwzzzdpm() != null ) {
            pimPaper.setGrzlwzzzdpm( dto.getGrzlwzzzdpm() );
        }
        if ( dto.getJlglbh() != null ) {
            pimPaper.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getJlczz() != null ) {
            pimPaper.setJlczz( dto.getJlczz() );
        }
        if ( dto.getJlspzt() != null ) {
            pimPaper.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getReason() != null ) {
            pimPaper.setReason( dto.getReason() );
        }
        if ( dto.getKwmc() != null ) {
            pimPaper.setKwmc( dto.getKwmc() );
        }
        if ( dto.getFj() != null ) {
            pimPaper.setFj( dto.getFj() );
        }
        if ( dto.getFbsj() != null ) {
            pimPaper.setFbsj( dto.getFbsj() );
        }
        if ( dto.getPimpapername() != null ) {
            pimPaper.setPimpapername( dto.getPimpapername() );
        }
        if ( dto.getKwqs() != null ) {
            pimPaper.setKwqs( dto.getKwqs() );
        }
        if ( dto.getCbs() != null ) {
            pimPaper.setCbs( dto.getCbs() );
        }
        if ( dto.getCbshkwmc() != null ) {
            pimPaper.setCbshkwmc( dto.getCbshkwmc() );
        }
        if ( dto.getJlss() != null ) {
            pimPaper.setJlss( dto.getJlss() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimPaper.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimPaper.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimpaperid() != null ) {
            pimPaper.setPimpaperid( dto.getPimpaperid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimPaper.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimPaper.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pimPaper.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            pimPaper.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimPaper.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getEnable() != null ) {
            pimPaper.setEnable( dto.getEnable() );
        }
        if ( dto.getYgbh() != null ) {
            pimPaper.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimPaper.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimPaper.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimPaper.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }

        return pimPaper;
    }

    @Override
    public PimPaperDTO toDto(PimPaper entity) {
        if ( entity == null ) {
            return null;
        }

        PimPaperDTO pimPaperDTO = new PimPaperDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimPaperDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimPaperDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getGrzlwzzzdpm() != null ) {
            pimPaperDTO.setGrzlwzzzdpm( entity.getGrzlwzzzdpm() );
        }
        if ( entity.getJlglbh() != null ) {
            pimPaperDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getJlczz() != null ) {
            pimPaperDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getJlspzt() != null ) {
            pimPaperDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getReason() != null ) {
            pimPaperDTO.setReason( entity.getReason() );
        }
        if ( entity.getKwmc() != null ) {
            pimPaperDTO.setKwmc( entity.getKwmc() );
        }
        if ( entity.getFj() != null ) {
            pimPaperDTO.setFj( entity.getFj() );
        }
        if ( entity.getFbsj() != null ) {
            pimPaperDTO.setFbsj( entity.getFbsj() );
        }
        if ( entity.getPimpapername() != null ) {
            pimPaperDTO.setPimpapername( entity.getPimpapername() );
        }
        if ( entity.getKwqs() != null ) {
            pimPaperDTO.setKwqs( entity.getKwqs() );
        }
        if ( entity.getCbs() != null ) {
            pimPaperDTO.setCbs( entity.getCbs() );
        }
        if ( entity.getCbshkwmc() != null ) {
            pimPaperDTO.setCbshkwmc( entity.getCbshkwmc() );
        }
        if ( entity.getJlss() != null ) {
            pimPaperDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimPaperDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimPaperDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimpaperid() != null ) {
            pimPaperDTO.setPimpaperid( entity.getPimpaperid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimPaperDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimPaperDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pimPaperDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            pimPaperDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimPaperDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getEnable() != null ) {
            pimPaperDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getYgbh() != null ) {
            pimPaperDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimPaperDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimPaperDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimPaperDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }

        return pimPaperDTO;
    }

    @Override
    public List<PimPaper> toDomain(List<PimPaperDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimPaper> list = new ArrayList<PimPaper>( dtoList.size() );
        for ( PimPaperDTO pimPaperDTO : dtoList ) {
            list.add( toDomain( pimPaperDTO ) );
        }

        return list;
    }

    @Override
    public List<PimPaperDTO> toDto(List<PimPaper> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimPaperDTO> list = new ArrayList<PimPaperDTO>( entityList.size() );
        for ( PimPaper pimPaper : entityList ) {
            list.add( toDto( pimPaper ) );
        }

        return list;
    }
}
